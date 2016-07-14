package converter;
import entidades.Medico;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "medicoConverter")
public class MedicoConverter implements Converter
{
     @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value)
    {
        if (value != null && !value.isEmpty())
        {
            return (Medico) component.getAttributes().get(value);
        }
        return null;
    }
    
    @Override
    public String getAsString(FacesContext context, UIComponent component, Object entity)
    {
        if (entity != null && entity instanceof Medico)
        {
            component.getAttributes().put(((Medico) entity).getId().toString(), entity);
            return ((Medico) entity).getId().toString();
        }

        return null;
    }
}
