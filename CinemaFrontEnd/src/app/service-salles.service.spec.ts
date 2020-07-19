import { TestBed } from '@angular/core/testing';

import { ServiceSallesService } from './service-salles.service';

describe('ServiceSallesService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceSallesService = TestBed.get(ServiceSallesService);
    expect(service).toBeTruthy();
  });
});
