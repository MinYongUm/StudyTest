package adaptertest;

public class FormatAdapter implements MediaPlayer{

    private MediaPackage mediaPackage;

    public FormatAdapter(MediaPackage m){
        mediaPackage = m;
    }

    @Override
    public void play(String filename) {
        System.out.println("Using Adapter ===> ");
        mediaPackage.playFile(filename);
    }
}
