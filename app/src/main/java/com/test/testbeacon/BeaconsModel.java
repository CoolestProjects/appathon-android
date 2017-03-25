package com.test.testbeacon;

import java.io.Serializable;
import java.util.List;

/**
 * Created by MTTUser on 25/03/2017.
 */

public class BeaconsModel implements Serializable{

  private List<Beacon> beacons;

  public List<Beacon> getBeacons() {
    return beacons;
  }

  public void setBeacons(List<Beacon> beacons) {
    this.beacons = beacons;
  }

  public class Beacon implements Serializable {
    private int minor;
    private int major;
    private String uuid;
    private String taskName;

    public int getMinor() {
      return minor;
    }

    public void setMinor(int minor) {
      this.minor = minor;
    }

    public int getMajor() {
      return major;
    }

    public void setMajor(int major) {
      this.major = major;
    }

    public String getUuid() {
      return uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }

    public String getTaskName() {
      return taskName;
    }

    public void setTaskName(String taskName) {
      this.taskName = taskName;
    }

    @Override
    public String toString() {
      return "BeaconsModel{" + "minor=" + minor + ", major=" + major + ", uuid='" + uuid + '\'' + ", taskName='" + taskName + '\'' + '}';
    }
  }

  @Override
  public String toString() {
    return "BeaconsModel{" + "beacons=" + beacons + '}';
  }
}
