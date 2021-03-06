package com.kosta.day08;

public class Television implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV의 전원을 킵니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV의 전원을 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VALUE) {
            this.volume = RemoteControl.MAX_VALUE;
        } else if (volume < RemoteControl.MIN_VALUE) {
            this.volume = RemoteControl.MIN_VALUE;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Television{");
        sb.append('}');
        return sb.toString();
    }
}
