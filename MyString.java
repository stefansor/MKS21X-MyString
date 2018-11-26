public class MyString implements CharSequence,Comparable<CharSequence>{
  public char[] data;
/*creates char[] representing all the chars in the CharSequence in MyString*/
  public MyString(CharSequence s){
    data = new char[s.length()];
    for(int i = 0; i < data.length; i++){
      data[i] = s.charAt(i);
    }
  }
/*loops through data and adds to an empty string*/
  public String toString(MyString s){
    return this.data.toString();
  }
/*just returns the char at the index in data catches IndexOutOfBoundsException*/
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
/*returns the length of data and thus the CharSequence*/
  public int length(){
    return this.data.length;
  }
/*uses charAt to create another string that contains the chars from start inlcusive
to end exclusive*/
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
/*have yet not tested - comapres the lexigrapgical ordering of the chars
and lengths*/
  public int compareTo(CharSequence s){
    try{
      MyString ss = new MyString(s);
      if(this.data.length > s.length()){
        return 1;
      }
      if(this.data.length < s.length()){
        return -1;
      }
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
