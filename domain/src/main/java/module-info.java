module domain {
    requires com.fasterxml.jackson.databind;
    requires lombok;
    requires java.persistence;
    exports com.openinno.domain.models;
    exports com.openinno.domain.interfaces;
}