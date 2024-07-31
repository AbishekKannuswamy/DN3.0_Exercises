package FactoryMethodPatternExample;



abstract class Document {
 abstract void open();
}

class WordDocument extends Document {
 void open() {
     System.out.println("Opening Word");
 }
}

class PdfDocument extends Document {
 void open() {
     System.out.println("Opening PDF");
 }
}

class ExcelDocument extends Document {
 void open() {
     System.out.println("Opening Excel");
 }
}

abstract class DocumentFactory {
 abstract Document createDocument();
}

class WordDocumentFactory extends DocumentFactory {
 Document createDocument() {
     return new WordDocument();
 }
}

class PdfDocumentFactory extends DocumentFactory {
 Document createDocument() {
     return new PdfDocument();
 }
}

class ExcelDocumentFactory extends DocumentFactory {
 Document createDocument() {
     return new ExcelDocument();
 }
}


