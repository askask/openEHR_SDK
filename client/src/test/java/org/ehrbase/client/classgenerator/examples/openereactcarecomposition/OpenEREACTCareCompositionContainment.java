package org.ehrbase.client.classgenerator.examples.openereactcarecomposition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.examples.openereactcarecomposition.definition.AssessmentSection;
import org.ehrbase.client.classgenerator.examples.openereactcarecomposition.definition.BackgroundSection;
import org.ehrbase.client.classgenerator.examples.openereactcarecomposition.definition.ResponseSection;
import org.ehrbase.client.classgenerator.examples.openereactcarecomposition.definition.SituationSection;
import org.ehrbase.client.classgenerator.examples.shareddefinition.CategoryDefiningcode;
import org.ehrbase.client.classgenerator.examples.shareddefinition.Language;
import org.ehrbase.client.classgenerator.examples.shareddefinition.SettingDefiningcode;
import org.ehrbase.client.classgenerator.examples.shareddefinition.Territory;

import java.time.temporal.TemporalAccessor;

public class OpenEREACTCareCompositionContainment extends Containment {
  public SelectAqlField<OpenEREACTCareComposition> OPEN_E_R_E_A_C_T_CARE_COMPOSITION = new AqlFieldImp<OpenEREACTCareComposition>(OpenEREACTCareComposition.class, "", "OpenEREACTCareComposition", OpenEREACTCareComposition.class, this);

  public SelectAqlField<TemporalAccessor> END_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(OpenEREACTCareComposition.class, "/context/end_time|value", "endTimeValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Participation> PARTICIPATIONS = new ListAqlFieldImp<Participation>(OpenEREACTCareComposition.class, "/context/participations", "participations", Participation.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(OpenEREACTCareComposition.class, "/language", "language", Language.class, this);

  public SelectAqlField<PartyIdentified> HEALTH_CARE_FACILITY = new AqlFieldImp<PartyIdentified>(OpenEREACTCareComposition.class, "/context/health_care_facility", "healthCareFacility", PartyIdentified.class, this);

  public SelectAqlField<ResponseSection> RESPONSE = new AqlFieldImp<ResponseSection>(OpenEREACTCareComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Response']", "response", ResponseSection.class, this);

  public SelectAqlField<AssessmentSection> ASSESSMENT = new AqlFieldImp<AssessmentSection>(OpenEREACTCareComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Assessment']", "assessment", AssessmentSection.class, this);

  public SelectAqlField<Territory> TERRITORY = new AqlFieldImp<Territory>(OpenEREACTCareComposition.class, "/territory", "territory", Territory.class, this);

  public SelectAqlField<BackgroundSection> BACKGROUND = new AqlFieldImp<BackgroundSection>(OpenEREACTCareComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Background']", "background", BackgroundSection.class, this);

  public SelectAqlField<TemporalAccessor> START_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(OpenEREACTCareComposition.class, "/context/start_time|value", "startTimeValue", TemporalAccessor.class, this);

  public SelectAqlField<SituationSection> SITUATION = new AqlFieldImp<SituationSection>(OpenEREACTCareComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Situation']", "situation", SituationSection.class, this);

  public SelectAqlField<PartyProxy> COMPOSER = new AqlFieldImp<PartyProxy>(OpenEREACTCareComposition.class, "/composer", "composer", PartyProxy.class, this);

  public SelectAqlField<SettingDefiningcode> SETTING_DEFININGCODE = new AqlFieldImp<SettingDefiningcode>(OpenEREACTCareComposition.class, "/context/setting|defining_code", "settingDefiningcode", SettingDefiningcode.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(OpenEREACTCareComposition.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<String> LOCATION = new AqlFieldImp<String>(OpenEREACTCareComposition.class, "/context/location", "location", String.class, this);

  public SelectAqlField<CategoryDefiningcode> CATEGORY_DEFININGCODE = new AqlFieldImp<CategoryDefiningcode>(OpenEREACTCareComposition.class, "/category|defining_code", "categoryDefiningcode", CategoryDefiningcode.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(OpenEREACTCareComposition.class, "/context/other_context[at0001]/items[at0002]", "extension", Cluster.class, this);

  private OpenEREACTCareCompositionContainment() {
    super("openEHR-EHR-COMPOSITION.encounter.v1");
  }

  public static OpenEREACTCareCompositionContainment getInstance() {
    return new OpenEREACTCareCompositionContainment();
  }
}
