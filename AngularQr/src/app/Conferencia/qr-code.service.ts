import { Injectable } from '@angular/core';
import * as QrCode from 'qrcode';

@Injectable({
  providedIn: 'root'
})
export class QrCodeService {

  constructor() { }

  generateQrCode(data: any): Promise<string> {
    return new Promise((resolve, reject) => {
      QrCode.toDataURL(JSON.stringify(data), (err, url) => {
        if (err) {
          reject(err);
        } else {
          resolve(url);
        }
      });
    });
  }
}
