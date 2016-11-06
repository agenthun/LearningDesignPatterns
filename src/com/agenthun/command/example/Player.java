package com.agenthun.command.example;

/**
 * Created by agenthun on 2016/11/6.
 * TetrisMachine 向左
 * TetrisMachine 向右
 * TetrisMachine 快速落下
 * TetrisMachine 改变形状
 */
public class Player {
    public static void main(String[] args) {
        TetrisMachine machine = new TetrisMachine();

        //构造四种命令
        LeftCommand leftCommand = new LeftCommand(machine);
        RightCommand rightCommand = new RightCommand(machine);
        FastToBottomCommand fastToBottomCommand = new FastToBottomCommand(machine);
        TransformCommand transformCommand = new TransformCommand(machine);

        //建立请求者，设置执行命令
        Buttons buttons = new Buttons();
        buttons.setLeftCommand(leftCommand);
        buttons.setRightCommand(rightCommand);
        buttons.setFastToBottomCommand(fastToBottomCommand);
        buttons.setTransformCommand(transformCommand);

        //请求者执行命令
        buttons.toLeft();
        buttons.toRight();
        buttons.toBottom();
        buttons.toTransform();
    }
}
