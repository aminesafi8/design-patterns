package tn.aminesafi.structural.composite;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Triangle implements Shape {

    @Override
    public void draw(String fillColor) {
        log.info("Drawing Triangle with color [{}] ", fillColor);
    }

}