package interfaces.delegacion

interface A {
    fun functionA(){}
}

interface B {
    fun functionB(){}
}

class C(val a: A, val b: B) {
    fun functionC(){
        a.functionA()
        b.functionB()
    }
}