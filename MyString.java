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
  public String toString(){
    String seq = "";
    for(int h= 0; h < this.data.length; h++){
      seq = seq + this.data[h];
    }
    return seq;
  }
/*just returns the char at the index in data catches IndexOutOfBoundsException*/
  public char charAt(int a){
    if(a >= this.data.length || a < 0){
      throw new IndexOutOfBoundsException("Invalid Index");
    }
    return this.data[a];
  }
/*returns the length of data and thus the CharSequence*/
  public int length(){
    return this.data.length;
  }
/*uses charAt to create another string that contains the chars from start inlcusive
to end exclusive*/
  public String subSequence(int start, int end){
    String seq = "";
    if(start < 0 || start > this.data.length || end < 0 || end > this.data.length || start > end ){
      throw new IndexOutOfBoundsException("Invalid start or finish");
    }
    for(int k = start; k < end; k++){
      seq = seq + this.data[k];
    }
    return seq;
  }
/*have yet not tested - comapres the lexigrapgical ordering of the chars
and lengths*/
  public int compareTo(CharSequence s){
    MyString ss = new MyString(s);
    int len = 0;
    if(this.data == null || ss.data == null){
      throw new NullPointerException("Either of the values cannot be null");
    }
    if(ss.length() > this.length()){
      len = this.length();
    }
    else{
      len = ss.length();
    }
    for(int i = 0; i < len; i++){
      if(this.charAt(i) + 0 > s.charAt(i) + 0){
        return 1;
      }
      if(this.charAt(i) + 0 < s.charAt(i) + 0){
        return -1;
      }
    }
    if(this.data.length > s.length()){
      return 1;
    }
    if(this.data.length < s.length()){
      return -1;
    }
    return 0;
  }
}
