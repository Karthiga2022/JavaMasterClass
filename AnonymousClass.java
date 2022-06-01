package VidhinSan;

public abstract class AnonymousClass implements AnonymousInterface {

    public abstract void learnAbstract();
    public void work()
    {
        System.out.println("Practice coding Anonymous class");
    }

    @Override
    public void learnJava() {
        System.out.println("Exploring java Inner class");
    }



}

//Anonymous Inner class instead of extending the AnonymousClass class
// we can have the needed implementation of method only in needed place using Anonymous Inner class

class AnonymousInnerClass
{

    public static void main(String[] args) {

        AnonymousClass ac=new AnonymousClass() {
            @Override
            public void learnAbstract() {
                System.out.println("Hi");
            }
        };
        ac.learnAbstract();


        AnonymousClass obj = new AnonymousClass() {
            @Override
            public void learnAbstract() {

            }

            public void work() {
                System.out.println("Learning Inner Class");
            }
        };

        obj.work();

        //Object Creation for Anonymous Interface

        AnonymousInterface interfaceObj = new AnonymousClass() {
            @Override
            public void learnAbstract() {

            }
        };
     //   interfaceObj.learnJava();

        AnonymousInterface interfaceObj1 = new AnonymousInterface() {
            @Override
            public void learnJava() {
                System.out.println("Happy Exploring");
            }
        };

        interfaceObj1.learnJava();

    }
 }

    //Anonymous inner class using Interface



