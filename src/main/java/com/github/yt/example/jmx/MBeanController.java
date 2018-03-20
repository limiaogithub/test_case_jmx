package com.github.yt.example.jmx;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Controller;

@Controller
@ManagedResource(objectName = "mbean:name=MBeanController")
public class MBeanController {
    private static int i = 100;

    @ManagedAttribute
    public int getI() {
        return i;
    }

    @ManagedAttribute
    public void setI(int i) {
        this.i = i;
    }
}