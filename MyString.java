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
    for(int j = 0; j < this.data.length; j++){
      str = str + this.data[j];
    }
    return str;
  }





}
