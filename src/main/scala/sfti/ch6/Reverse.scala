package sfti.ch6

object Reverse extends App {
  for(i <- args.length-1 to 0 by -1) {
    println(args(i))
  }
}
