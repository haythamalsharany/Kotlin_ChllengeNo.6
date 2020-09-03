fun main() {
    var android = AndroidDeveloper()
    var ios = IOSDeveloper("IOS devloper")
    var web = WebDeveloper("web Dev", 5000.0, "haytham", 27)

    android.name="omar"
    android.age=20
    android.salary=20000.0


    ios.name="wheeb"
    ios.age=30
    ios.salary=30000.0
    println("----------------------------------------------------------")
    android.androidApp()
    println("dev name:"+android.name+"\nage:"+android.age+"\nsalary:"+android.salary)
    println("-----------------------------------------------------------")
    ios.iosApp()
    println("dev name:"+ios.name+"\nage:"+ios.age+"\nsalary:"+ios.salary)
    println("-----------------------------------------------------------")
    web.webApp()
    println("dev name:"+web.name+"\nage:"+web.age+"\nsalary:"+web.salary)





}

open class Employee(private var pDevKind: String) {
    public var name = "";
    public var age = 0
    public var salary = 0.0;
    var devKind = ""

    init {
        this.devKind = pDevKind
    }

    constructor(pName: String, pAge: Int, pSalary: Double, pDevKind: String) : this(pDevKind) {
        this.name = pName
        this.age = pAge
        this.salary = pSalary
    }

}

class AndroidDeveloper : Employee("Android Devs") {


    fun androidApp() {
        println(super.devKind)
    }
}

class IOSDeveloper : Employee {


    constructor(devKind: String) : super(devKind)

    fun iosApp() {
        println(devKind)
    }
}

class WebDeveloper : Employee {


    constructor(_pDevKind: String, _pSalary: Double, _pName: String, _pAge: Int) : super(
        _pName,
        _pAge,
        _pSalary,
        _pDevKind
    );
    fun webApp() {
        println(super.devKind)

    }
}