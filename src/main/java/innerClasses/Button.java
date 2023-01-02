package main.java.innerClasses;

public class Button {
    private String title;
    private OnClickListener listener;

    public Button( String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public void setListener(OnClickListener listener) {
        this.listener = listener;
    }

    public void onClick(){
        this.listener.onClick(this.title);
    }

    public interface OnClickListener{
        public void onClick(String title);
    }
}
