/*
 * DO NOT MODIFY - this class was auto generated by openapi-processor-micronaut
 *
 * test
 * time
 * https://docs.openapiprocessor.io/micronaut
 */

package generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import javax.validation.constraints.NotNull;

@Introspected
public class EndpointBody {

    @NotNull
    @JsonProperty("flag")
    private Boolean flag;

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

}
