import {Injectable} from '@angular/core';
import {MatSnackBar, MatSnackBarModule} from "@angular/material/snack-bar";

@Injectable({
  providedIn: 'root'
})
export class NotificationService {

  constructor(private snackbar: MatSnackBar) {
  }

  public snowSnackBar(message: string): void {
    this.snackbar.open(message, "", {
      duration: 2000
    });
  }
}
