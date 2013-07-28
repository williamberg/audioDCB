package data.impl;

import java.util.Arrays;

import data.AudioArray;


public class StereoAudioArray implements AudioArray<StereoAudioSample> {

  private StereoAudioSample[] array;

  public StereoAudioArray(StereoAudioSample[] array) {
    this.array = array;
  }
  
  @Override
  public StereoAudioSample[] getRange(int start, int count) {
    return Arrays.copyOfRange(array, start, start + count);
  }

  @Override
  public void setRange(StereoAudioSample[] range, int start) {
    System.arraycopy(range, 0, array, start, range.length);
  }
  
  @Override
  public int getLength() {
    return array.length;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for(StereoAudioSample s : array) {
      sb.append(s.toString());
      sb.append('\n');
    }
    return sb.toString();
  }

}
