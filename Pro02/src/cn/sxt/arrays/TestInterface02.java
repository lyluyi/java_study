package cn.sxt.arrays;

public class TestInterface02 {

}

interface InterfaceA {
void aaa();
}
  
interface InterfaceB {
void bbb();
}

// 接口可以实现多继承 C接口可以继承A B
interface InterfaceC extends InterfaceA,InterfaceB {
void ccc();
}
  
class TestClass implements InterfaceC{
  
@Override
public void aaa() {
// TODO Auto-generated method stub
}
  
@Override
public void bbb() {
// TODO Auto-generated method stub
}
 @Override
public void ccc() {
// TODO Auto-generated method stub
}
}