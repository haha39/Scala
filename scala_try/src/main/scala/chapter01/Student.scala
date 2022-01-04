package chapter01

class Student(name: String, var age: Int) {
  def printInfo(): Unit = {
    println(this.name + " " + this.age + " " + Student.school)  //可以不用加this
  }
}


//引入半生對象
object  Student{
  val school: String = "hehehe"

  def main(args: Array[String]): Unit = {
    val alice = new Student(name = "alice", age = 20)
    val bob = new Student(name = "bob", age = 23)

    alice.printInfo()
    bob.printInfo()

  }


}


