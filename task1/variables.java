public  class variables {
    int z =120;
     
    public  void printData(){
    boolean str= true;
    char ch='c';
    short a=2;
    byte b=3;
    int c=10;
    long d=20;
    float e=10f;
    double f= 233;
    System.out.println("Boolean:" + str);
    System.out.println("Char:" + c);
    System.out.println("Short:" + a);
    System.out.println("byte:" + b);
    System.out.println("int:" + c);
    System.out.println("long:" + d);
    System.out.println("float:" + e);
    System.out.println("long:" + f);

    System.out.println("Instance :" + z);
         
    }
    public static void main(String[] args){
         
        variables obj = new variables();
         obj.printData();
          
    }
}