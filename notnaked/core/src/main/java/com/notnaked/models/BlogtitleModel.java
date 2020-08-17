package com.notnaked.models;

import com.peregrine.nodetypes.models.AbstractComponent;
import com.peregrine.nodetypes.models.IComponent;
import com.peregrine.nodetypes.models.Container;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

/*
    //GEN[:DATA
    {
  "definitions": {
    "Blogtitle": {
      "type": "object",
      "x-type": "component",
      "properties": {
        "text": {
          "type": "string",
          "x-source": "inject",
          "x-form-type": "texteditor"
        }
      }
    }
  },
  "name": "Blogtitle",
  "componentPath": "notnaked/components/blogtitle",
  "package": "com.notnaked.models",
  "modelName": "Blogtitle",
  "classNameParent": "AbstractComponent"
}
//GEN]
*/

//GEN[:DEF
@Model(
        adaptables = Resource.class,
        resourceType = "notnaked/components/blogtitle",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = IComponent.class
)
@Exporter(
        name = "jackson",
        extensions = "json"
)

//GEN]
public class BlogtitleModel extends AbstractComponent {

  public BlogtitleModel(Resource r) {
      super(r);
  }

  //GEN[:INJECT
  /* {"type":"string","x-source":"inject","x-form-label":"Title","x-form-type":"text"} */
  @Inject
  private String title;


//GEN]

  //GEN[:GETTERS
  /* {"type":"string","x-source":"inject","x-form-label":"Title","x-form-type":"text"} */
  public String getTitle() {
      return title;
  }


//GEN]

  //GEN[:CUSTOMGETTERS
  //GEN]

}