
sealed class Bool

object False : Bool()

object True : Bool()

fun Bool.show(): String = when (this) {
    is False -> "False"
    is True -> "True"
}

sealed class Nat

class S(
        val _arg0: Lazy<Nat>
) : Nat()

object Z : Nat()

fun Nat.show(): String = when (this) {
    is S -> "S (${_arg0.value.show()})"
    is Z -> "Z"
}

sealed class NatList

class Con(
        val _arg0: Lazy<Nat>,
        val _arg1: Lazy<NatList>
) : NatList()

object Nil : NatList()

fun NatList.show(): String = when (this) {
    is Con -> "Con (${_arg0.value.show()}) (${_arg1.value.show()})"
    is Nil -> "Nil"
}

fun One(): Lazy<Nat> = lazy { S(lazyOf(Z)) }

fun Two(): Lazy<Nat> = lazy { S(One()) }

fun Three(): Lazy<Nat> = lazy { S(Two()) }

fun add(_param0: Lazy<Nat>, _param1: Lazy<Nat>): Lazy<Nat> = lazy {
    (_param0.value as? Z)?.let { _local0 ->
        val y = _param1
        return@lazy y.value
    }
    (_param0.value as? S)?.let { _local0 ->
        val x = _local0._arg0
        val y = _param1
        return@lazy S(add(x, y))
    }
    throw RuntimeException("Mismatched arguments on 'add' call")
}

fun Ones(): Lazy<NatList> = lazy { Con(One(), Ones()) }

fun take(_param0: Lazy<Nat>, _param1: Lazy<NatList>): Lazy<NatList> = lazy {
    (_param0.value as? Z)?.let { _local0 ->
        val l = _param1
        return@lazy Nil
    }
    (_param1.value as? Nil)?.let { _local0 ->
        val x = _param0
        return@lazy Nil
    }
    (_param0.value as? S)?.let { _local0 ->
        (_param1.value as? Con)?.let { _local1 ->
            val n = _local0._arg0
            val x = _local1._arg0
            val l = _local1._arg1
            return@lazy Con(x, take(n, l))
        }
    }
    throw RuntimeException("Mismatched arguments on 'take' call")
}

fun sum(_param0: Lazy<NatList>): Lazy<Nat> = lazy {
    (_param0.value as? Nil)?.let { _local0 ->
        return@lazy Z
    }
    (_param0.value as? Con)?.let { _local0 ->
        val x = _local0._arg0
        val l = _local0._arg1
        return@lazy add(x, sum(l)).value
    }
    throw RuntimeException("Mismatched arguments on 'sum' call")
}

fun gte(_param0: Lazy<Nat>, _param1: Lazy<Nat>): Lazy<Bool> = lazy {
    (_param1.value as? Z)?.let { _local0 ->
        val x = _param0
        return@lazy True
    }
    (_param0.value as? Z)?.let { _local0 ->
        val x = _param1
        return@lazy False
    }
    (_param0.value as? S)?.let { _local0 ->
        (_param1.value as? S)?.let { _local1 ->
            val x = _local0._arg0
            val y = _local1._arg0
            return@lazy gte(x, y).value
        }
    }
    throw RuntimeException("Mismatched arguments on 'gte' call")
}

fun ls(_param0: Lazy<Nat>, _param1: Lazy<Nat>): Lazy<Bool> = lazy {
    (_param1.value as? Z)?.let { _local0 ->
        val x = _param0
        return@lazy False
    }
    (_param0.value as? Z)?.let { _local0 ->
        val x = _param1
        return@lazy True
    }
    (_param0.value as? S)?.let { _local0 ->
        (_param1.value as? S)?.let { _local1 ->
            val x = _local0._arg0
            val y = _local1._arg0
            return@lazy ls(x, y).value
        }
    }
    throw RuntimeException("Mismatched arguments on 'ls' call")
}

fun appendIf(_param0: Lazy<Bool>, _param1: Lazy<Nat>, _param2: Lazy<NatList>): Lazy<NatList> = lazy {
    (_param0.value as? True)?.let { _local0 ->
        val x = _param1
        val l = _param2
        return@lazy Con(x, l)
    }
    (_param0.value as? False)?.let { _local0 ->
        val x = _param1
        val l = _param2
        return@lazy l.value
    }
    throw RuntimeException("Mismatched arguments on 'appendIf' call")
}

fun filterGte(_param0: Lazy<Nat>, _param1: Lazy<NatList>): Lazy<NatList> = lazy {
    (_param1.value as? Nil)?.let { _local0 ->
        val t = _param0
        return@lazy Nil
    }
    (_param1.value as? Con)?.let { _local0 ->
        val t = _param0
        val x = _local0._arg0
        val l = _local0._arg1
        return@lazy appendIf(gte(x, t), x, filterGte(t, l)).value
    }
    throw RuntimeException("Mismatched arguments on 'filterGte' call")
}

fun filterLs(_param0: Lazy<Nat>, _param1: Lazy<NatList>): Lazy<NatList> = lazy {
    (_param1.value as? Nil)?.let { _local0 ->
        val t = _param0
        return@lazy Nil
    }
    (_param1.value as? Con)?.let { _local0 ->
        val t = _param0
        val x = _local0._arg0
        val l = _local0._arg1
        return@lazy appendIf(ls(x, t), x, filterLs(t, l)).value
    }
    throw RuntimeException("Mismatched arguments on 'filterLs' call")
}

fun append(_param0: Lazy<NatList>, _param1: Lazy<NatList>): Lazy<NatList> = lazy {
    (_param0.value as? Nil)?.let { _local0 ->
        val l2 = _param1
        return@lazy l2.value
    }
    (_param0.value as? Con)?.let { _local0 ->
        val x = _local0._arg0
        val l1 = _local0._arg1
        val l2 = _param1
        return@lazy Con(x, append(l1, l2))
    }
    throw RuntimeException("Mismatched arguments on 'append' call")
}

fun sort(_param0: Lazy<NatList>): Lazy<NatList> = lazy {
    (_param0.value as? Nil)?.let { _local0 ->
        return@lazy Nil
    }
    (_param0.value as? Con)?.let { _local0 ->
        val x = _local0._arg0
        val l = _local0._arg1
        return@lazy append(sort(filterLs(x, l)), lazyOf(Con(x, sort(filterGte(x, l))))).value
    }
    throw RuntimeException("Mismatched arguments on 'sort' call")
}

fun sample_list(): Lazy<NatList> = lazy { Con(Three(), lazyOf(Con(One(), lazyOf(Con(Two(), lazyOf(Nil)))))) }

fun doubled_list(): Lazy<NatList> = lazy { append(sample_list(), sample_list()).value }

fun main(args: Array<String>) {
    println(sum(take(Three(), Ones())).value.show())
    println(doubled_list().value.show())
    println(sort(doubled_list()).value.show())
}
