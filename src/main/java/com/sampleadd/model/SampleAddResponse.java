
package com.sampleadd.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * SapmpleAdd Response Object
 **/

@ApiModel(description = "Number Add Response Object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-26-15T11:24:23.272+05:30")
public class SampleAddResponse   {
  
  private double total = 0.0;    

  @ApiModelProperty(value = "")
  //@JsonProperty("total")
  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }


  @Override
  public int hashCode() {
    return Objects.hash(total);
  }

  public String outResp() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    
    sb.append("    Sum: ").append(toIndentedString(total)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "0.0";
    }
    return o.toString();
  }
}

