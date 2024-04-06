// Convert WebP to JPG, PNG, GIF, TIFF in Java and apply filters like Flip, Brightness, Contrast, Gamma, Rotate, Watermark 
Converter converter = new Converter("filePath/WebPImage.webp");

// Set Image Conversion Options. You can apply one filter at a time.
ImageConvertOptions options = new ImageConvertOptions();
options.setFormat(ImageFileType.Jpg);
options.setFlipMode(ImageFlipModes.FlipX);
options.setBrightness(50);
options.setContrast(50);
options.setGamma(0.5F);
options.setGrayscale(true);
options.setRotateAngle(90);

// Set Watermark Text and Appearance 
WatermarkOptions watermark = new WatermarkOptions();
watermark.setText("GroupDocs");
watermark.setFont(new Font("Arial", Font.BOLD, 130));
watermark.setColor(Color.WHITE);
watermark.setBackground(false);
watermark.setRotationAngle(-45);
watermark.setTop(70);
watermark.setLeft(150);
watermark.setTransparency(0.2);
options.setWatermark(watermark);

converter.convert("filePath/WebPToJPG.jpg", options);
@Acido1337
Comment
