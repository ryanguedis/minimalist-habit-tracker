import './Frame1.css';

import AddHabitBox from '../frame1/addhabit/addhabitbox/AddHabitBox';
import AddHabitTitle from '../frame1/addhabit/addhabittittle/AddHabitTitle';
import CadActionBox from '../frame1/cad_actionbox/box/CadActionBox';

/**
 * Frame1
 * Container principal da aplicação.
 * Fundo preto com borda branca arredondada (stroke 6px).
 * Recebe children para abrigar os elementos internos futuramente.
 */
function Frame1({ children, onAction, habitName, setHabitName }) {
  return (
    <div className="frame1">
      {/* Grupo: Título + Input — centralizados como uma unidade */}
      <div className="add-habit-group">
        <AddHabitTitle />
        <AddHabitBox habitName={habitName} setHabitName={setHabitName} />
        <CadActionBox onAction={onAction} />
      </div>
      {children}
    </div>
  );
}

export default Frame1;
