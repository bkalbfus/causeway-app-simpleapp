package domainapp.modules.simple.dom.so;

import java.time.Instant;

import javax.inject.Named;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.causeway.applib.annotation.DomainObject;
import org.apache.causeway.applib.annotation.DomainObjectLayout;
import org.apache.causeway.applib.annotation.Editing;
import org.apache.causeway.applib.annotation.Nature;
import org.apache.causeway.applib.annotation.Property;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import domainapp.modules.simple.SimpleModule;

@Named(SimpleModule.NAMESPACE + ".ThingPage")
@DomainObject( nature = Nature.VIEW_MODEL )
@XmlRootElement( name = "ThingPage" )
@XmlAccessorType( XmlAccessType.FIELD )
@Slf4j
@DomainObjectLayout()
public class ThingPage {

    public String title() {
        return "thing page";
    }

    @Property( editing = Editing.ENABLED )
    @Getter @Setter
    private String prop1;

    @Property( editing = Editing.ENABLED )
    @Getter @Setter
    private String prop2;

    public ThingPage() {
        prop1 = Instant.now().toString();
        prop2 = Instant.now() + "_2";
        log.info( "Created new ThingPage with prop1 {} and prop2 {}", prop1, prop2 );
    }
}