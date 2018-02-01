
public class Test {

	public static void main(String[] args) {
		Person p=new Person();

       Person taro=new Person();
       taro.name="taro";
       taro.age=18;
       System.out.println(taro.name);
       System.out.println(taro.age);

       taro.talk();
       taro.walk();
       taro.run();

       Person jiro=new Person("jiro",20);
       System.out.println(jiro.name);
       System.out.println(jiro.age);

       jiro.talk();
       jiro.walk();
       jiro.run();

       Person hanako=new Person();
       hanako.name="鈴木花子";
       hanako.age=16;
       System.out.println(hanako.name);
       System.out.println(hanako.age);

       hanako.talk();
       hanako.walk();
       hanako.run();


       Person rina=new Person();
       rina.name="中島りな";
       rina.age=25;
       System.out.println(rina.name);
       System.out.println(rina.age);

       rina.talk();
       rina.walk();
       rina.run();

       Robot aibo=new Robot();
       aibo.name="aibo";
       System.out.println(aibo.name);

       aibo.talk();
       aibo.walk();
       aibo.run();

       Robot asimo=new Robot();
       asimo.name="asimo";
       System.out.println(asimo.name);

       asimo.talk();
       asimo.walk();
       asimo.run();

       Robot pepper=new Robot();
       pepper.name="pepper";
       System.out.println(pepper.name);

       pepper.talk();
       pepper.walk();
       pepper.run();

       Robot doraemon=new Robot();
       doraemon.name="doraemon";
       System.out.println(doraemon.name);

       doraemon.talk();
       doraemon.walk();
       doraemon.run();

       Person saburo=new Person("saburo");

       System.out.println(saburo.name);
       System.out.println(saburo.age);


       Person noname=new Person(25);

       System.out.println(noname.name);
       System.out.println(noname.age);


       Person hanako2=new Person(17,"hanako");

       System.out.println(hanako2.name);
       System.out.println(hanako2.age);

	}

}
