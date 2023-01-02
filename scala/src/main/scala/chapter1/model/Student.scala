package chapter1.model

class Student (name: String, age: Int){

  def printInfo(): Unit = {
    println("hello: " + name  + " " +  age + Student.school)
  }

}

// 伴生对象
object Student {
   val school: String = " No 6 high school"

  def main(args: Array[String]): Unit = {
    val alice = new Student("alice", 34);
    val nanyi = new Student("nannyi", 34);

    alice.printInfo()
    nanyi.printInfo()
  }
}