//业务函数

def test() {
  println("这是个定时器")

}

//定时函数
def oncePerSecond() {

  while (true) {
    test()
    Thread sleep 1000
  }
}

//主入口函数
def main(args: Array[String]) {

  oncePerSecond()

}