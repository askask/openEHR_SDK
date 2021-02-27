package org.ehrbase.client.classgenerator.examples.smicsbefundcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-02-16T12:58:09.911428200+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: null"
)
public class ErregerdetailsKeimSubtypElement implements LocatableEntity {
  /**
   * Path: SmICS Befund/SmICS-Ergebnis/Jedes Ereignis/Eigenschaften des beteiligten Erregers/Erregerdetails/Keim Subtyp
   * Description: Subtyp, welcher zusätzlich zur Speziesidentifizierung zur weiteren Kennzeichnung des Erregers genutzt werden kann, z.B. spa-Typ im Falle von S. aureus oder MLST-Typ.
   * Comment: Bestimmte Keimsubtypen beeinflussen die Wirtsreaktion bzw. Immunantwort.
   *                                                                 Beispielsweise ein Resultat einer spa-Typsierung bei einem S. aureus oder anderen Typsierungen wie MLST.
   *                                                             
   */
  @Path("/value|value")
  private String value;

  /**
   * Path: SmICS Befund/SmICS-Ergebnis/Jedes Ereignis/Eigenschaften des beteiligten Erregers/Erregerdetails/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setValue(String value) {
     this.value = value;
  }

  public String getValue() {
     return this.value ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}