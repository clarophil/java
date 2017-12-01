public class test
{
    public boolean concateneTest() {

        MyString classATester = new MyString();

        String a = "salut les ";

        String b = "zeros";

        String resultatAttendu = "salut les zeros";

        String resultatObtenu = classATester.concatene(a, b);

        if (resultatAttendu.compareTo(resultatObtenu) == 0) {

            return true;

        }

        else {

            return false;

        }
}


        }