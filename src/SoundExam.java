import com.sun.scenario.effect.impl.sw.sse.SSEBlend_DARKENPeer;

interface Sound {
    public void SoundUp(int level); // public 생략 가능
    public void SoundDown(int level);
}

class TV1 implements Sound {
    private int SndLevle;

    public TV1() {
        SndLevle = 0;
    }

    @Override
    public void SoundUp(int level) {
        SndLevle += level;
    }

    @Override
    public void SoundDown(int level) {
        SndLevle -= level;
        if(SndLevle < 0) {
            SndLevle = 0;
        }
    }
}

class Radio implements Sound {
    private int SndLevle;

    public Radio() {
        SndLevle = 0;
    }
    @Override
    public void SoundUp(int level) {
        SndLevle += level;
    }

    @Override
    public void SoundDown(int level) {
        SndLevle -= level;
        if(SndLevle < 0) {
            SndLevle = 0;
        }
    }
}
class SoundExam {
    public static void main(String[] args) {
        Sound radio = new Radio();
        Sound tv = new TV1();
        radio.SoundUp(5);
        tv.SoundUp(5);
    }
}
