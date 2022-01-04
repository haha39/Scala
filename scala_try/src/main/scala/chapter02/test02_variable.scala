package chapter02

import chapter01.Student

object test02_variable {
  def main(args: Array[String]): Unit = {
    //聲明一個便亮的通用語法
    var a: Int = 10

    //1.聲明變量時，類型可以省略，編譯器自動推倒，及類型推導
    var a1 = 10
    val b1 = 32

    //2.類型確認後，就不能修改，說明scala是強數據類型語言
    var a2 = 12   //type :　int
    //a2 = "hello" nono

    //3.變量聲明時，必須要有初值
    //var a3: Int  nono

    //4.在聲明/定義一個變量時，可以使用var或val來修飾，var修飾的變量可以蓋變，val則不行
    a1 = 44
    //b1 = 3443   nono


    var apple = new Student(name="apple", age = 1)
    apple = null
    apple = new Student(name="pinapple", age = 1)


    //val不能直接向上面一樣用new改，要用下面這種方式
    val jojo = new Student(name="jojo", age = 18)
    jojo.age = 19     //注意age要是var喔
    jojo.printInfo()



  }
}


