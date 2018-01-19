module com.tbc.java9.mavenmultimodule.service {

    requires com.tbc.java9.mavenmultimodule.repository;

    exports com.tbc.java9.mavenmultimodule.service.author;
    exports com.tbc.java9.mavenmultimodule.service.book;

}