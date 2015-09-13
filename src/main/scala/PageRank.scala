import breeze.linalg._

/**
 * @author Oleksiy_Dyagilev
 */
object PageRank extends App {


  def fillMatrix(rows:Int)(cols:Int)(v:Double):DenseMatrix[Double] = new DenseMatrix(rows, cols, List.fill(rows*cols)(v).toArray)

  val N = 3
  val beta = 1.0
  val M = new DenseMatrix(N, N, Array(0, 1.0/2, 1.0/2, 0, 0, 1.0, 1.0, 0, 0))
  println("M = " + M)

  val A = (M *= beta) + (fillMatrix(N)(N)(1d/N) *= (1-beta))

  println("A = " + M)

  val r0 = fillMatrix(3)(1)(1.0)

  val r1 = A * r0
  val r2 = A * r1
  val r3 = A * r2
  val r4 = A * r3
  val r5 = A * r4
  val r6 = A * r5

  println(s"r1 = $r1")
  println(s"r2 = $r2")
  println(s"r3 = $r3")
  println(s"r4 = $r4")
  println(s"r5 = $r5")
  println(s"r6 = $r6")






}
