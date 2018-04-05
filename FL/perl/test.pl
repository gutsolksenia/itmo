my @links = ();
while (<STDIN>) {
  chomp;
  $s = $_;
  if ($s =~ /<a href="[^<>]*">/) {
  	$s =~ s/<a href="|">//g;
  	push @links, $s;
  }
}
foreach my $l (@links) {
  print $l, "\n";
}