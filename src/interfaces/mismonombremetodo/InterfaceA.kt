package interfaces.mismonombremetodo

interface InterfaceA {
    fun funD() {}
}
 
interface InterfaceB {
    fun funD() {}
}

class classA : InterfaceA, InterfaceB {
    override fun funD() {
       // super.funD()
    }
}


class classB : InterfaceA, InterfaceB {
    override fun funD() {
        super<InterfaceA>.funD()
    }
}