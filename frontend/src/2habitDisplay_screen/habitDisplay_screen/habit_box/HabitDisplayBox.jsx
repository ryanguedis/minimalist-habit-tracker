import '../habit_tittles/HabitDisplayBox.css';
import BarsTitles from '../progressbar/pbar_tittles/BarsTitles';

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
