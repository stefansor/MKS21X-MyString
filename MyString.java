public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;

  public MyString(CharSequence s){
    data = new char[s.length()];
    for(int i = 0; i < data.length; i++){
      data[i] = s.charAt(i);
    }
  }

  public String toString(MyString s){
    String str = "";
    if(this.data.length ==0){
      return "";
    }
    for(int j = 0; j < this.data.length; j++){
      str = str + this.data[j];
    }
    return str;
  }

  public char charAt(int a){
    try{
      return this.data[a];
    }
    catch(IndexOutOfBoundsException e){
      System.out.println("Index is out of bounds");
      System.exit(1);
    }
    return this.data[a];
  }

  public int length(){
    return this.data.length;
  }

  public String subSequence(int start, int finish){
    String seq = "";
    try{
      for(int k = start; k < finish; k++){
        seq = seq + this.data[k];
      }
    }
    catch(IndexOutOfBoundsException e){
      System.out.println("Index out of bounds");
      System.exit(1);
    }
    return seq;
  }

  public int compareTo(CharSequence s){
    try{
      for(int i = 0; i < this.data.length; i++){
        if(this.charAt(i) + 0 > s.charAt(i) + 0){
          return 1;
        }
        if(this.charAt(i) + 0 < s.charAt(i) + 0){
          return -1;
        }
      }
    }
    catch(NullPointerException e){
      System.out.println("Value cannot be null");
      System.exit(1);
    }
    catch(ClassCastException e){
      System.out.println("Objects cannot be compared");
      System.exit(1);
    }
    return 0;
  }




}
