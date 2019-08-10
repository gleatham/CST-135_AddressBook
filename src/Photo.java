public class Photo {
    private String photoIdNum;
    private String fileName;
    private String dateOfPhoto;
    private String description;

    /**
     * Main constructor for Photo
     * @param photoIdNum
     * @param fileName
     * @param dateOfPhoto
     * @param description
     */
    Photo(String photoIdNum, String fileName, String dateOfPhoto, String description){
        this.photoIdNum = photoIdNum;
        this.fileName = fileName;
        this.dateOfPhoto = dateOfPhoto;
        this.description = description;
    }

    public String getPhotoIdNum() {
        return photoIdNum;
    }

    public void setPhotoIdNum(String photoIdNum) {
        this.photoIdNum = photoIdNum;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getDateOfPhoto() {
        return dateOfPhoto;
    }

    public void setDateOfPhoto(String dateOfPhoto) {
        this.dateOfPhoto = dateOfPhoto;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
