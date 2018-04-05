module Lib
    ( order3,
      highestBit,
      smartReplicate,
      contains,
      removeAt
    ) where

import Data.List 

order3 :: Ord a => (a, a, a) -> (a, a, a)
order3 (x, y, z) = (\[x1, y1, z1] -> (x1, y1, z1)) $ sort [x, y, z]

highestBit :: Num a => a -> Int
highestBit x = 1 --TODO

smartReplicate :: [Int] -> [Int]
smartReplicate (x:l) = replicate x x ++ smartReplicate l
smartReplicate [] = []

contains :: Eq a => a -> [[a]] -> [[a]]
contains x l = filter (\l1 -> isSubsequenceOf [x] l1) l
contains x [] = []

removeAt :: Int -> [a] -> [a]
