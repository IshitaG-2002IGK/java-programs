import java.util.*;
class string{
public static void main(String args[]){
ArrayList<String> alist=new ArrayList<String>();
alist.add("Blue");
alist.add("Red");
alist.add("Green");
alist.add("Pink");
alist.add("Orange");
alist.add("voilet");

//displaying elements
System.out.println(alist);

//Adding "Steve" at the fourth position
alist.add(3, "white");

//displaying elements
System.out.println(alist);
}
}
