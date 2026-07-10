import './HabitDisplayBox.css';
import BarsTitles from './progress_bars/barstitles/BarsTitles';

function HabitDisplayBox({ habitName }) {
  return (
    <div className="habit-display-container">
      <div className="habit-display-box">
        <span className="habit-display-name">{habitName}</span>
        <BarsTitles />
      </div>
    </div>
  );
}

export default HabitDisplayBox;
