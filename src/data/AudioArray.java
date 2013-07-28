package data;


public interface AudioArray<T> {

  T[] getRange(int start, int end);
  
  void setRange(T[] range, int start);
  
  int getLength();
  
}
