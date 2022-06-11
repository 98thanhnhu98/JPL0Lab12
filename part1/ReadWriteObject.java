package JPL0Lab12.part1;

import java.io.*;
public class ReadWriteObject  {  //ERROR  NOT DONE
    public void write(File obj){
        //write object
        try {
            Student s = new Student(1, "minh");
            ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(obj)));
            // write a String object
            oos.writeObject("The current Date and Time is ");
            oos.writeObject(s);
            System.out.println("Object writed!");
            oos.flush();
            oos.close();
        }catch (Exception a) {
            System.out.println(a.getMessage());
        }
    }
    public void Read(File obj){
        //read object
        try{
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(obj)));
        Student test = (Student)ois.readObject();
        System.out.println(test.getId()+test.getFirstName());
        ois.close();
    } catch (Exception ex) {
        ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ReadWriteObject a =  new ReadWriteObject();
        File obj = new File("object.txt");
        a.write(obj);
        a.Read(obj);
    }
}


