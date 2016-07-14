package converter;
import entidades.Paciente;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "pacienteConverter")
public class PacienteConverter implements Converter
{
     @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value)
    {
        if (value != null && !value.isEmpty())
        {
            return (Paciente) component.getAttributes().get(value);
        }
        return null;
    }
    
    @Override
    public String getAsString(FacesContext context, UIComponent component, Object entity)
    {
        if (entity != null && entity instanceof Paciente)
        {
            component.getAttributes().put(((Paciente) entity).getId().toString(), entity);
            return ((Paciente) entity).getId().toString();
        }

        return null;
    }
}
