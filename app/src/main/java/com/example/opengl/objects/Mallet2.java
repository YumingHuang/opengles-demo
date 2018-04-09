/***
 * Excerpted from "OpenGL ES for Android",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/kbogla for more book information.
 ***/
package com.example.opengl.objects;


import com.example.opengl.data.VertexArray;
import com.example.opengl.programs.ColorShader2Program;
import com.example.opengl.programs.ColorShaderProgram;
import com.example.opengl.utils.Geometry;
import com.example.opengl.utils.Geometry.Point;

import java.util.List;

import static com.example.opengl.utils.Geometry.*;

public class Mallet2 {
    private static final int POSITION_COMPONENT_COUNT = 3;

    public final float radius;
    public final float height;

    private final VertexArray vertexArray;
    private final List<ObjectBuilder.DrawCommand> drawList;

    public Mallet2(float radius, float height, int numPointsAroundMallet) {
        ObjectBuilder.GeneratedData generatedData =
                ObjectBuilder.createMallet(new Point(0f, 0f, 0f), radius, height, numPointsAroundMallet);

        this.radius = radius;
        this.height = height;

        vertexArray = new VertexArray(generatedData.vertexData);
        drawList = generatedData.drawList;
    }

    public void bindData(ColorShader2Program colorProgram) {
        vertexArray.setVertexAttribPointer(0,
                colorProgram.getPositionAttributeLocation(),
                POSITION_COMPONENT_COUNT, 0);
    }

    public void draw() {
        for (ObjectBuilder.DrawCommand drawCommand : drawList) {
            drawCommand.draw();
        }
    }
}
