import './Frame1.css';

import AddHabitBox from '../1primary_screen/addhabit_action/addhabit_box/AddHabitBox';
import AddHabitTitle from '../1primary_screen/addhabit_action/addhabit_tittle/AddHabitTitle';
import CadActionBox from '../1primary_screen/cadast_action/cadast_box/CadActionBox';

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
