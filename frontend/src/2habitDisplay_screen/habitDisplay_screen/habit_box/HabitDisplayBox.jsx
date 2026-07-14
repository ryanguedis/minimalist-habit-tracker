import '../habit_tittles/HabitDisplayBox.css';
import BarsTitles from '../progressbar/pbar_tittles/BarsTitles';

function HabitDisplayBox({ habitName, index = 0 }) {
  // Formata o index para sempre ter 2 dígitos (ex: 01, 02)
  const formattedIndex = String(index + 1).padStart(2, '0');

  return (
    <div className="habit-display-container">
      <div className="habit-display-box">
        <div className="habit-header">
          <span className="habit-index">// {formattedIndex}</span>
          <span className="habit-display-name">
            <span className="habit-bracket">[ </span>
            {habitName}
            <span className="habit-bracket"> ]</span>
          </span>
          <div className="habit-status-container">
            <span className="habit-status-dot"></span>
          </div>
        </div>
        <BarsTitles />
        <div className="habit-footer">
          <div className="bars-separator"></div>
          <div className="expand-habit">
            Expandir Habito ↗
          </div>
        </div>
      </div>
    </div>
  );
}

export default HabitDisplayBox;
