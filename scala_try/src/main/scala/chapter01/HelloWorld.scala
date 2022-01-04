package chapter01

/*
  object : 關鍵字，聲明一個單例對象
 */

object HelloWorld {
  /*
    main  方法 : 從外部可以直接調用執行的方法
    def   方法名稱(參數名稱: 參數類型): 返回值類型 = { 方法體 }
   */
  def main(args: Array[String]): Unit = {
    println("hello world")
    System.out.println("hello scala from java")
  }
}



